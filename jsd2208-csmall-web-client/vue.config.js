const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy: { //配置跨域
      '/': {
        target: 'http://localhost:9080/', //填写请求的目标地址
        changOrigin: true, //允许跨域
      }
    }
  },
})