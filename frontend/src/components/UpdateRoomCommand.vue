<template>
    <v-card outlined>
        <v-card-title>
            UpdateRoom
        </v-card-title>

        <v-card-text>
            <String label="RoomId" v-model="value.roomId" :editMode="editMode"/>
            <String label="RoomNumber" v-model="value.roomNumber" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateRoom"
            >
                UpdateRoom
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
        name: 'UpdateRoomCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.roomId = '';
            this.value.roomNumber = '';
        },
        watch: {
        },
        methods: {
            updateRoom() {
                this.$emit('updateRoom', this.value);
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

