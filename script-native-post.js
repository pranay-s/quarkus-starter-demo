import http from 'k6/http';
import { sleep } from 'k6';

export default function () {
  var url='http://localhost:8080/user';
  var payload= JSON.stringify({
	emailId: "1abc@gmail.com",
        empUserName: "pranay",
        mobileNumber: 9028411,
        password: "buoqgbgvac",
  });
  var params = {
    headers: {
      'Content-Type': 'application/json',
    },
  };
  http.post(url,payload,params);
}

