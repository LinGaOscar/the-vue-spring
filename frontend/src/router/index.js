import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: () => import('@/views/Home.vue'),
        children: [
            {
                path: '/user_list',
                component: () => import('@/components/UserList.vue')
            },
            {
                path: '/group_setting',
                component: () => import('@/components/GroupSetting.vue')
            },
            {
                path: '/task_list',
                component: () => import('@/components/TaskList.vue')
            },
            {
                path: '/task_chart',
                component: () => import('@/components/TaskChart.vue')
            },
            {
                path: '/table_chart',
                component: () => import('@/components/TableChart.vue')
            }

        ]
    },
    {
        path: '/about',
        name: 'About',
        component: () => import('@/views/About.vue')
    },
    {
        path: '/login',
        name: 'Login',
        component: () => import ('@/views/Login.vue')

    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
