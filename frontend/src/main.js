import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import VueAxios from 'vue-axios'
import antd from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'

Vue.config.productionTip = false

Vue.use(VueAxios, axios)
Vue.use(antd)

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
