<template>
    <main>
        <Navbar />
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Добавить клиента</h2>
              <form @submit.prevent="addClient">
                
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="name" class="form-label">Имя</label>
                    <input id="name"  type="text" name="name" class="form-control" placeholder="Имя" required v-model="client.name">
                  </div>
                </div>

               
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="surname" class="form-label">Фамилия</label>
                    <input id="surname"  type="text" name="surname" class="form-control" placeholder="Фамилия" required v-model="client.surname">
                  </div>
                </div>

               
                <div class="row">
                  <div class="col-md-12 form-group">
                    <input class="btn btn-primary w-100" type="submit" value="Готово">
                  </div>
                </div>
      
                <div>
                  
                </div>
              </form>
        
            </div>
          </div>
    </main>
</template>
<script>
import Navbar from '../components/Navbar.vue';

    export default {
        name: 'AddClient',
        components: {
            Navbar
        },

        data() {
            return {
                client : {
                    name: '',
                    surname: '',
                }
            }
        },

        methods: {
            addClient(){
                fetch('http://localhost:8080/client/add', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.client)
                })
                .then(data => {
                    console.log(data)
                    this.$router.push("/clients");
                })

            }
        },
            
    }


</script>