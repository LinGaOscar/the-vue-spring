<template>
    <a-layout id="home">
      <a-layout-header>
        <Menu/>
      </a-layout-header>
      <a-layout>
        <a-layout-sider>
          <Sider/>
        </a-layout-sider>
        <a-layout-content>
          <HelloWorld msg="Welcome to Your Vue.js App"/>
        </a-layout-content>
      </a-layout>
      <a-layout-footer>Footer</a-layout-footer>
    </a-layout>

</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import Menu from '@/components/Menu.vue'
import Sider from "@/components/Sider"

export default {
  name: 'Home',
  components: {
    HelloWorld,
   Menu,
    Sider
  }
}
</script>

<style>
#home{
  text-align: center;
}
.ant-layout {
  margin-bottom: 48px;
}
.ant-layout:last-child {
  margin: 0;
}
.ant-layout-sider {
  line-height: 120px;
}
.ant-layout-footer {
  line-height: 1.5;
}
</style>