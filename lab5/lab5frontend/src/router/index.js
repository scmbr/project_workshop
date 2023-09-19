import { createRouter, createWebHistory } from 'vue-router'
import MainView from '../views/MainView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: MainView
    },
    {
      path: '/clients',
      name: 'clients',
      component: () => import('../views/ViewClients.vue')
    },
    {
      path: '/client/add',
      name: 'clientAdd',
      component: () => import('../views/AddClient.vue')
    },
    {
      path: '/client/edit/:id',
      name: 'clientEdit',
      component: () => import('../views/UpdateClient.vue')
    },
    {
      path: '/requests',
      name: 'requests',
      component: () => import('../views/ViewRequests.vue')
    },
    {
      path: '/request/add',
      name: 'requestAdd',
      component: () => import('../views/AddRequest.vue')
    },
    {
      path: '/request/edit/:id',
      name: 'requestEdit',
      component: () => import('../views/UpdateRequest.vue')
    },
    {
      path: '/service/add',
      name: 'addService',
      component: () => import('../views/AddService.vue')
    },
    {
      path: '/services',
      name: 'services',
      component: () => import('../views/ViewServices.vue')
    },
    {
      path: '/service/edit/:id',
      name: 'serviceEdit',
      component: () => import('../views/UpdateService.vue')
    },
    ]
})

export default router
