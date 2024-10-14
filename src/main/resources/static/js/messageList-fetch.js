/**
 * 
 */

function messageListFetch() {
	const loading = document.getElementById("loading_id");
	const error = document.getElementById("error_id");
	const list = document.getElementById("messageList_id");
	
	loading.style.display = "block";
	error.style.display = "none";
	list.innerHTML = "";
	
	fetch("/messages/api")
	.then(response => {
		if (!response.ok) {
			throw new Error("Error: ", error);
		}
		return response.json();
	})
	.then(message => {
		loading.style.display = "none";
		
		message.forEach(msg => {
			const li = document.createElement("li");
			li.innerHTML = `<a href="/messages/${msg.id}">${msg.id} - ${msg.message}</a>`;
			
			list.appendChild(li);
		});
	})
	.catch(error => {
		console.error("Error: ", error);
		
		loading.style.display = "none";
		error.style.display = "block";
	})
}


window.addEventListener("DOMContentLoaded", messageListFetch);