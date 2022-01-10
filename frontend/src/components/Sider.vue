<template>
  <a-menu theme="dark" mode="inline" :default-selected-keys="['user_list']"
          :default-open-keys="[0]" :style="{lineHeight:'64px',height:'100%'}">

    <a-sub-menu v-for="(values,index) in menu" :key="index">
      <span slot="title"><a-icon type="bars"/><span>{{ values.functionName }}</span></span>
      <a-menu-item v-for="value in values.object" :key="value.functionId"
                   @click="routerPush(value.functionId)">
        {{ value.functionName }}
      </a-menu-item>

    </a-sub-menu>
  </a-menu>
</template>

<script>
export default {
  name: "x-sider", data() {
    return {
      menuTemp: []
    }
  },
  created() {
    this.$nextTick(function () {
      this.getSider()
    })
  }, computed: {
    menu: function () {
      let temp = []
      if (this.menuTemp != "") {
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
      return temp;
    },
  }, methods: {
    async getSider() {
      await this.axios.get('/api/test').then((response) => {
        // console.log(response.data)
        this.menuTemp = response.data
      }).catch((err) => {
        console.log(err)
      }).finally(() => {
        // console.log('sider done')
        this.routerPush('user_list')
      })
    },
    routerPush(index){
      this.$router.push(index)
    }
  }
}
</script>

<style scoped>

</style>