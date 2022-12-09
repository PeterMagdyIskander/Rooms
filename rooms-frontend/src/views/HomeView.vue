<template>
  <div class="home">
    <img src="@/assets/monitor_illustration_2.svg" alt="speak up image" class="home-bg">
    <room-code />
  </div>
</template>

<script>
// @ is an alias to /src
import RoomCode from "@/components/RoomCode.vue";

export default {
  name: "HomeView",
  components: {
    RoomCode,
  },
};
</script>

<style lang="scss" scoped>
  .home{
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    &-bg{
      width: 50%;
      margin: 15px;
    }
  }
</style>