import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    component: HomeView
  },
  {
    path: '/about',
    component: () => import('../views/AboutView.vue')
  },
  {
    path: '/login',
    component: () => import('../views/LoginView.vue')
  },
  {
    path: '/sys-admin/temp/album/add-new',
    component: () => import('../views/sys-admin/temp/AlbumAddNewView.vue')
  },
  {
    path: '/sys-admin/temp/brand/add-new',
    component: () => import('../views/sys-admin/temp/BrandAddView.vue')
  },
  {
    path: '/sys-admin/temp/attribute-template/add-new',
    component: () => import('../views/sys-admin/temp/AttributeTemplateAddNewView.vue')
  },
  {
    path: '/sys-admin/temp/category/add-new',
    component: () => import('../views/sys-admin/temp/CategoryAddNewView.vue')
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
