
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManagementReservationManager from "./components/listers/ReservationManagementReservationCards"
import ReservationManagementReservationDetail from "./components/listers/ReservationManagementReservationDetail"

import RoomManagementRoomManager from "./components/listers/RoomManagementRoomCards"
import RoomManagementRoomDetail from "./components/listers/RoomManagementRoomDetail"

import CheckinoutManagementCheckInOutManager from "./components/listers/CheckinoutManagementCheckInOutCards"
import CheckinoutManagementCheckInOutDetail from "./components/listers/CheckinoutManagementCheckInOutDetail"

import PaymentManagementPaymentManager from "./components/listers/PaymentManagementPaymentCards"
import PaymentManagementPaymentDetail from "./components/listers/PaymentManagementPaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservationManagements/reservations',
                name: 'ReservationManagementReservationManager',
                component: ReservationManagementReservationManager
            },
            {
                path: '/reservationManagements/reservations/:id',
                name: 'ReservationManagementReservationDetail',
                component: ReservationManagementReservationDetail
            },

            {
                path: '/roomManagements/rooms',
                name: 'RoomManagementRoomManager',
                component: RoomManagementRoomManager
            },
            {
                path: '/roomManagements/rooms/:id',
                name: 'RoomManagementRoomDetail',
                component: RoomManagementRoomDetail
            },

            {
                path: '/checkinoutManagements/checkInOuts',
                name: 'CheckinoutManagementCheckInOutManager',
                component: CheckinoutManagementCheckInOutManager
            },
            {
                path: '/checkinoutManagements/checkInOuts/:id',
                name: 'CheckinoutManagementCheckInOutDetail',
                component: CheckinoutManagementCheckInOutDetail
            },

            {
                path: '/paymentManagements/payments',
                name: 'PaymentManagementPaymentManager',
                component: PaymentManagementPaymentManager
            },
            {
                path: '/paymentManagements/payments/:id',
                name: 'PaymentManagementPaymentDetail',
                component: PaymentManagementPaymentDetail
            },



    ]
})
