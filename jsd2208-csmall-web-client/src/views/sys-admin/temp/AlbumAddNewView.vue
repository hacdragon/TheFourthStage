<template>
  <div>
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="名称" prop="name">
        <el-input v-model="ruleForm.name"></el-input>
      </el-form-item>
      <el-form-item label="简介" prop="description">
        <el-input v-model="ruleForm.description"></el-input>
      </el-form-item>
      <el-form-item label="排序序号" prop="sort">
        <el-input v-model.number="ruleForm.sort"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
        <el-button @click="resetForm('ruleForm')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
export default {
  name: "AlbumAddNewView",
  data() {
    var checkSort = (rule, value, callback) => {
      if (!value) {
        return callback(new Error('序号不能为空'));
      }
      setTimeout(() => {
        if (!Number.isInteger(value)) {
          console.log(Number.valueOf(value));
          callback(new Error('请输入数字值'));
        } else {
          if (value > 255) {
            callback(new Error('必须小于255'));
          }else if(value < 0) {
            callback(new Error('必须大于0'));
          }
          else {
            callback();
          }
        }
      }, 1000);
    };
    return {
      ruleForm: {
        name: '',
        description: '',
        sort:'',
      },
      rules: {
        name: [
          { required: true, message: '请输入相册名称', trigger: 'blur' },
          { min: 4, max: 64, message: '长度在 4 到 64 个字符', trigger: 'blur' }
        ],
        description:[
          { required: true, message: '请输入简介', trigger: 'blur' },
          { min: 4, max: 64, message: '长度在 4 到 64 个字符', trigger: 'blur' }
        ],
        sort:[
          {validator: checkSort, trigger: 'blur',required: true},
        ]
      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          console.log(this.ruleForm);
          this.$http.post('album/add-new',this.ruleForm).then(response => {
            if(response.data.state==200) {
              this.$router.push('/')
            }else {
              this.$message.error(response.data.message);
            }
          })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
}
</script>