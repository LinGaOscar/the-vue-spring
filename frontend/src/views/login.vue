<template>
  <div>
    <h3>登入</h3>
    使用者名稱:<input type="text" v-model="loginForm.loginName" placeholder="請輸入使用者名稱"/>
    <br><br>
    密碼： <input type="password" v-model="loginForm.password" placeholder="請輸入密碼"/>
    <br><br>
    <button>登入</button>
  </div>
</template>

<script>
export default {
  name: "Login",
  data: function () {
    return {
      loginForm: {
        loginName: '',
        password: ''
      },
      responseResult: []
    }
  },
  methods: {}
}

</script>

<style scoped>

</style>