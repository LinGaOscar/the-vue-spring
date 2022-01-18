<template>
  <a-layout>
    <h2>User List</h2>
    <a-table :columns="columns"
             :data-source="userListTemp" bordered
             :row-key="record => record.userId">
    </a-table>

  </a-layout>

</template>

<script>
export default {
  name: "UserList",
  data() {
    return {
      userListTemp: [],
      columns: [
        {
          title: '姓名',
          dataIndex: 'userName',
          width: '20%',
          sorter: (a, b) => a.userName.length - b.userName.length,
        },
        {
          title: '使用群',
          dataIndex: 'group.groupName',
          width: 100,
        },
        {
          title: '部門',
          dataIndex: 'department.departmentName',
          width: 150,
        },
        {
          title: '處',
          dataIndex: 'department.division.divisionName',
          width: 150,
        },
        {
          title: '啟用',
          dataIndex: 'isDelete',
          width: 150,
        }
      ]
    }
  }, mounted() {
    this.$nextTick(function () {
      this.getUserList()
    })
  },
  methods: {
    async getUserList() {
      await this.axios.get('/api/getAllUser').then((response) => {
        this.userListTemp = response.data
      }).catch((err) => {
        console.log(err)
      }).finally(() => {
      })
    }

  }
}
</script>

<style scoped>

</style>