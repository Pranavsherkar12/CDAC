const navBtn = document.querySelector(".menu-btn")
const navList = document.querySelector(".nav-list")

navBtn.addEventListener('click',function(){
    navList.classList.toggle("active");  
})
