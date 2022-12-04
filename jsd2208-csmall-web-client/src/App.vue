<template>
  <div id="app">
    <el-container>
      <el-header>
        <nav>
          <router-link to="/">Home</router-link> |
          <router-link to="/about">About</router-link>
        </nav>
      </el-header>
      <el-container>
        <el-aside width="200px">      </el-aside>
        <el-container>
        <el-main>
          <el-row :gutter="20">
            <el-col :span="6"></el-col>
            <el-col :span="18">
              <router-view/>
            </el-col>
          </el-row>
        </el-main>
        <el-footer>    </el-footer>
        </el-container>
      </el-container>
    </el-container>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
<script setup>
import HelloWorld from "@/components/HelloWorld.vue";
</script>