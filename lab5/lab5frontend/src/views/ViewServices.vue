<template>
    <main>
        <Navbar />

        <!-- Table-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Услуги</h1>
                    <!--Add button -->
                    <a href="/service/add" class="btn btn-primary">Добавить услугу</a>
                    <table class="table table-striped">
                        <thead>
                          <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Дата</th>
                            <th scope="col">Название</th>
                            <th scope="col">Id заявки</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr v-for="service in services" :key="service.id_service">
                            <th scope="row">{{service.id_service}}</th>
                            <td>{{service.date}}</td>
                            <td>{{service.name}}</td>
                            <td>{{service.id_request}}</td>
                            <td>
                              <a class="btn btn-primary" :href="`/service/edit/${service.id_service}`">Редактировать</a>
                              <button class="btn btn-danger mx-2" @click="deleteService(service.id_service)">Удалить</button>
                            </td>
                          </tr>
                        </tbody>
                      </table>
                </div>
            </div>
        </div>
        
    </main>
</template>


<script>
import Navbar from '../components/Navbar.vue'

    export default {
        name: 'ViewServices',
        components: {
            Navbar
        },
        data() {
            return {
                services: []
            }
        },

        beforeMount(){
            this.getServices()
        },

        methods: {
            getServices(){
                fetch('http://localhost:8080/services')
                .then(res => res.json())
                .then(data => {
                    this.services = data
                    console.log(data)
                })
            },
            deleteService(id){
                fetch(`http://localhost:8080/service/${id}`, {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getServices()
                })
            }
        }

    }

</script>