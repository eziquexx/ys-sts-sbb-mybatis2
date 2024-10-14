/**
 * 
 */

const messageForm = document.getElementById("messageForm");

messageForm.addEventListener("submit", function(e) {
	e.preventDefault();
	
	const message = {
		message: document.getElementById("message_id").value,
	};
	
	fetch("/messages/create", {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json',
		},
		body: JSON.stringify(message),
	})
	.then(response => {
		if (response.ok) {
			alert("메세지 등록 성공");
			messageForm.reset();
		} else {
			alert("메세지 등록 실패");
		}
	})
	.catch(error => {
		console.error("Error: ", error);
		alert("에러 발생");
	});
	
});