<template>
  <a-menu theme="dark" mode="inline" :default-selected-keys="['1']"
          :default-open-keys="['sub1']" :style="{lineHeight:'64px',height:'100%'}">

    <a-menu-item key="1">
      <a-icon type="pie-chart"/>
      <span>Option 1</span>
    </a-menu-item>
    <a-menu-item key="2">
      <a-icon type="desktop"/>
      <span>Option 2</span>
    </a-menu-item>

    <a-sub-menu v-for="(values,index) in menu" :key="index" >
      <span slot="title"><a-icon type="mail"/><span>{{values.functionName}}</span></span>
      <a-menu-item key="5">
        Option 5
      </a-menu-item>
      <a-menu-item key="6">
        Option 6
      </a-menu-item>

    </a-sub-menu>
  </a-menu>
</template>

<script>
export default {
  name: "x-sider", data() {
    return {
      menuTemp:[]
    }
  },
  mounted() {
    this.$nextTick(function (){
      this.getSider();
    })
  },computed:{
    menu: function () {
      let temp = []
      if (this.menuTemp) {
        this.menuTemp.side_menu.forEach(r => {
          if (r.functionId == "system_setting") {
            r.object = this.menuTemp.system_setting
          }
          if (r.functionId == "task_setting") {
            r.object = this.menuTemp.task_setting
          }
          if (r.functionId == "report_output") {
            r.object = this.menuTemp.report_output
          }
        })
        temp = this.menuTemp.side_menu
      }
      console.log(temp)
      return temp;
    },
  },methods:{
    async getSider() {
      await this.axios.get('/api/test').then((response) => {
        // console.log(response.data)
        this.menuTemp = response.data
      }).catch((err) => {
        console.log(err)
      }).finally(() => {
        console.log('sider done')
      })
    }
  }
}
</script>

<style scoped>

</style>