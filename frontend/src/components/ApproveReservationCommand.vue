<template>
    <v-card outlined>
        <v-card-title>
            ApproveReservation
        </v-card-title>

        <v-card-text>
            <String label="ReservationId" v-model="value.reservationId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="approveReservation"
            >
                ApproveReservation
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
        name: 'ApproveReservationCommand',
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
            approveReservation() {
                this.$emit('approveReservation', this.value);
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

