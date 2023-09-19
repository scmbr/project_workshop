<template>
    <main>
        <Navbar />

        <!-- Table-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Заявки</h1>
                    <!--Add button -->
                    <a href="/request/add" class="btn btn-primary">Добавить заявку</a>
                    <table class="table table-striped">
                        <thead>
                          <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Дата</th>
                            <th scope="col">Название</th>
                            <th scope="col">Id клиента</th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr v-for="request in requests" :key="request.id_request">
                            <th scope="row">{{request.id_request}}</th>
                            <td>{{request.date}}</td>
                            <td>{{request.name}}</td>
                            <td>{{request.id_client}}</td>
                            <td>
                              <a class="btn btn-primary" :href="`/request/edit/${request.id_request}`">Редактировать</a>
                              <button class="btn btn-danger mx-2" @click="deleteRequest(request.id_request)">Удалить</button>
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
        name: 'ViewRequests',
        components: {
            Navbar
        },
        data() {
            return {
                requests: []
            }
        },

        beforeMount(){
            this.getRequests()
        },

        methods: {
            getRequests(){
                fetch('http://localhost:8080/requests')
                .then(res => res.json())
                .then(data => {
                    this.requests = data
                    console.log(data)
                })
            },
            deleteRequest(id){
                fetch(`http://localhost:8080/request/${id}`, {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getRequests()
                })
            }
        }

    }

</script>