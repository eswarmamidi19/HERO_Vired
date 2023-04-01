const url = " https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=3fd2be6f0c70a2a598f084ddfb75487c&page=1";
let img_grid = document.querySelector('.img-grid');
let inp = document.querySelector('#inp');
console.log(inp);

async function data() {
     let response = await fetch(url);
     let data = await response.json();
      console.log(data.results);
      let img_arr = data.results.map((d)=>{return "https://image.tmdb.org/t/p/w300"+d.poster_path});
      console.log(img_arr);
      let img_html = img_arr.map((link,i) => {
        return `<div class="card">
        <p class= "name">${data.results[i].title}</p>
        <div class="img">
            <img src="${link}" alt="" srcset="" height="300px">
        </div>
        <div class="desc hide">
            <p> <span class="name">rating :</span> ${data.results[i]. vote_average}</p>

            <p> <span class="name">overview :</span>  ${data.results[i].overview}</p>
        </div>
    </div>`
        
      });
      console.log(img_html);
      img_html.forEach((code)=>{
          img_grid.innerHTML+=code
      })
      let card = document.querySelectorAll('.card');
      let desc = document.querySelectorAll('.desc');
      Array.from(card).forEach((c,i)=>{
        c.addEventListener('mouseover',(e)=>{
            desc[i].classList.remove('hide')
        })
        c.addEventListener('mouseout',(e)=>{
            desc[i].classList.add('hide')
        })
      })
}
data();
inp.addEventListener("keyup",(e)=>{
    
})