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

    <a-sub-menu key="sub1">
      <span slot="title"><a-icon type="mail"/><span>Navigation One</span></span>
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
    return {}
  },
  async created() {
    await this.axios.get('/api/test').then((response) => {
      console.log(response.data)
    }).catch((err) => {
      console.log(err)
    }).finally(() => {
      console.log('sider done')
    })
  }
}
</script>

<style scoped>

</style>