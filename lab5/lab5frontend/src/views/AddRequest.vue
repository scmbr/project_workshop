<template>
    <main>
        <Navbar />
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Добавить заявку</h2>
              <form @submit.prevent="addRequest">
                
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="name" class="form-label">Название</label>
                    <input id="name"  type="text" name="name" class="form-control" placeholder="Название" required v-model="request.name">
                  </div>
                </div>

               
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="date" class="form-label">Дата</label>
                    <input id="date"  type="text" name="date" class="form-control" placeholder="YYYY-MM-DD" required v-model="request.date">
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="id_client" class="form-label">Id клиента</label>
                    <input id="id_client"  type="text" name="Id_client" class="form-control" placeholder="Id клиента" required v-model="request.id_client">
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
        name: 'AddRequest',
        components: {
            Navbar
        },

        data() {
            return {
                request : {
                    date:'',
                    name: '',
                    id_client: '',
                }
            }
        },

        methods: {
            addRequest(){
                fetch('http://localhost:8080/request/add', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.request)
                })
                .then(data => {
                    console.log(data)
                    this.$router.push("/requests");
                })

            }
        },
            
    }


</script>