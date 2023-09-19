<template>
    <main>
        <Navbar />

        <!-- Table-->
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="text-center">Клиенты</h1>
                    <!--Add button -->
                    <a href="/client/add" class="btn btn-primary">Добавить клиента</a>
                    <table class="table table-striped">
                        <thead>
                          <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Имя</th>
                            <th scope="col">Фамилия</th>
                           
                          </tr>
                        </thead>
                        <tbody>
                          <tr v-for="client in clients" :key="client.id_client">
                            <th scope="row">{{client.id_client}}</th>
                            <td>{{client.name}}</td>
                            <td>{{client.surname}}</td>
                            <td>
                              <a class="btn btn-primary" :href="`/client/edit/${client.id_client}`">Редактировать</a>
                              <button class="btn btn-danger mx-2" @click="deleteClient(client.id_client)">Удалить</button>
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
        name: 'ViewClients',
        components: {
            Navbar
        },
        data() {
            return {
                clients: []
            }
        },

        beforeMount(){
            this.getClients()
        },

        methods: {
            getClients(){
                fetch('http://localhost:8080/clients')
                .then(res => res.json())
                .then(data => {
                    this.clients = data
                    console.log(data)
                })
            },
            deleteClient(id){
                fetch(`http://localhost:8080/client/${id}`, {
                    method: 'DELETE'
                })
                .then(data => {
                    console.log(data)
                    this.getClients()
                })
            }
        }

    }

</script>