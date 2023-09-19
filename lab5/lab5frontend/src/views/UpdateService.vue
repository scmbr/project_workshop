<template>
    <main>
        <Navbar/>
        <div class="my-5">
            <div class="mx-auto w-25 " style="max-width:100%;">
              <h2 class="text-center mb-3">Редактировать услугу</h2>
              <form @submit.prevent="updateService">
                
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="name" class="form-label">Название</label>
                    <input id="name"  type="text" name="name" class="form-control" placeholder="Имя" required v-model="service.name">
                  </div>
                </div>

                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="date" class="form-label">Дата</label>
                    <input id="date"  type="text" name="date" class="form-control" placeholder="YYYY-MM-DD" required v-model="service.date">
                  </div>
                </div>
                <div class="row">
                  <div class="col-md-12 form-group mb-3">
                    <label for="id_request" class="form-label">Id заявки</label>
                    <input id="id_request"  type="text" name="Id_request" class="form-control" placeholder="Id заявки" required v-model="service.id_request">
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
    name: 'UpdateService',
    components: {
        Navbar
    },

    data(){
        return {
            service: {
                date: '',
                name: '',
                id_request: ''
            }
        }
    },

    beforeMount(){
        this.getServices();
    },

    methods: {
        getServices(){
            fetch(`http://localhost:8080/service/${this.$route.params.id}`)
            .then(res => res.json())
            .then(data => {
                this.service = data;
                console.log(this.service);
            })

        },
        updateService(){
            fetch(`http://localhost:8080/service`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(this.service)
            })
            .then(data => {
                console.log(data);
                this.$router.push('/services');
            })
        }
    }
}

</script>