<template>
  <a-menu theme="dark" mode="horizontal" :style="{lineHeight:'64px',float:'right'}">
    <a-menu-item key="app">
      <a-icon type="appstore"/>
      Navigation Two
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
  name: 'x-menu',
  data() {
    return {}
  },
};
</script>
