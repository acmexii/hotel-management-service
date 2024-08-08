<template>
    <v-card outlined>
        <v-card-title>
            ProcessCheckInOut
        </v-card-title>

        <v-card-text>
            <String label="CheckInOutId" v-model="value.checkInOutId" :editMode="editMode"/>
            <String label="ReservationId" v-model="value.reservationId" :editMode="editMode"/>
            <String label="RoomId" v-model="value.roomId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="processCheckInOut"
            >
                ProcessCheckInOut
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ProcessCheckInOutCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.checkInOutId = '';
            this.value.reservationId = '';
            this.value.roomId = '';
        },
        watch: {
        },
        methods: {
            processCheckInOut() {
                this.$emit('processCheckInOut', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

