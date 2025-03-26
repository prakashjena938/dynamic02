const api = "http://localhost:8080/api/std/all"

function calling(){
fetch(api)
    .then(response=>response.json())
    .then(data=>{
        const usertable = document.querySelector('#usertableo tbody');
        usertable.innerHTML ='';
    data .forEach(user => {
        const row =document.createElement('tr');
        row.innerHTML=`
        <td>${user.id}</td>
         <td>${user.name}</td> 
         <td>${user.course}</td>
          <td>${user.email}</td> 
          <td>${user.age}</td>
          `;
        usertable.appendChild(row);
        
    })
    })
    .catch(error=>{
        console.log(error);
    });
    
}

window.onload= calling