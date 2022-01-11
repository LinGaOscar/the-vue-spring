<template>
  <div>
    <h2>User List</h2>
    <a-table :columns="columns" :data-source="userListTemp" :scroll="{ x: 1500, y: 300 }">
    </a-table>

  </div>

</template>

<script>
export default {
  name: "UserList",
  data(){
    return{
      userListTemp:[],
      columns:[

      ]
    }
  },mounted() {
    this.$nextTick(function () {
      this.getUserList()
    })
  },
  methods: {
    async getUserList() {
      await this.axios.get('/api/getAllUser').then((response) => {
        // console.log(response.data)
        this.userListTemp=response.data
      }).catch((err) => {
        console.log(err)
      }).finally(() => {
        // console.log('sider done')
      })
    }

  }
}
</script>

<style scoped>

</style>