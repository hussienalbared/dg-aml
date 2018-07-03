import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import 'rxjs/add/operator/map';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  }),
};

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  invalidLogin: boolean;
  constructor(private http: HttpClient) { }

  signIn(credentials) {
   this.http.post<UserResponse>('http://localhost:8081/aml/auth',
      JSON.stringify(credentials), httpOptions)
      .subscribe(data => {
        if (data && data.hasOwnProperty('token')) {
          localStorage.setItem('token', data.token);
          return true;
        }
        return false;
      });
  }

}

interface UserResponse {
  login: string;
  token: string;
}
