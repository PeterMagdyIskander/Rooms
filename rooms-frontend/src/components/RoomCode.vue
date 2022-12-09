<template>
    <div class="container">
        <input class="container-code" type="text" v-model="roomCode">
        <button class="container-submit" @click="submit">Go to Room</button>
    </div>
</template>

<script>
export default {
    name: "RoomCode",
    props: {
    },
    data() {
        return {
            roomCode: "",
        }
    },
    methods: {
        submit() {
            console.log(this.roomCode)
        }
    },
};
</script>

<style lang="scss" scoped>
.container {
    display: flex;
    align-items: center;
    gap: 10px;
    width: 600px;

    &-code {
        all: unset;
        width: 70%;
        height: 35px;
        border: 1px solid #707070;
        border-radius: 10px;
        font-size: 1.25rem;
    }

    &-submit {
        all: unset;
        width: 25%;
        height: 35px;
        border: 1px solid #707070;
        border-radius: 10px;
        font-size: 1.25rem;
        cursor: pointer;
        &:hover{
            background-color: #707070;
            color: white;
        }
    }
}
</style>