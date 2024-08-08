<template>
    <v-card outlined>
        <v-card-title>
            RejectReservation
        </v-card-title>

        <v-card-text>
            <String label="ReservationId" v-model="value.reservationId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="rejectReservation"
            >
                RejectReservation
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
        name: 'RejectReservationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.reservationId = '';
        },
        watch: {
        },
        methods: {
            rejectReservation() {
                this.$emit('rejectReservation', this.value);
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

