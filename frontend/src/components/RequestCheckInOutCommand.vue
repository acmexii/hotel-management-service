<template>
    <v-card outlined>
        <v-card-title>
            RequestCheckInOut
        </v-card-title>

        <v-card-text>
            <String label="ReservationId" v-model="value.reservationId" :editMode="editMode"/>
            <String label="RoomId" v-model="value.roomId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="requestCheckInOut"
            >
                RequestCheckInOut
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
        name: 'RequestCheckInOutCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reservationId = '';
            this.value.roomId = '';
        },
        watch: {
        },
        methods: {
            requestCheckInOut() {
                this.$emit('requestCheckInOut', this.value);
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

