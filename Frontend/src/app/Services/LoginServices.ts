import { Injectable } from '@angular/core';
import { User } from '../Pojos/User';
import { Role } from '../Pojos/Role';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import { prepareProfile } from 'selenium-webdriver/firefox';
import { Router } from '@angular/router';
import { map } from 'rxjs/operators';
import { Auth } from '../Pojos/Auth';


const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  const bodyContent = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private port:String = "http://localhost:8080";

    private usersUrl: string;

  constructor(private http:HttpClient,private router:Router) {}


  checkUser(p:User):Observable<User>{
        return this.http.post<User>(this.port+'/company/employee',p);
    }

  addUser(user1:string,pass:string,role:string){
    return this.http.post(this.port+'/user/register',null,{params: new HttpParams().set('username',user1).set('pass',pass).set('role',role)});
  }
  



checkUser1(username:string,pass:string):Observable<Auth>{
  return this.http.post<Auth>(this.port+'/user/login1',null,{params: new HttpParams().set('username',username).set('pass',pass)});
}

isLoggedIn(){
  var ifusernamepresent = sessionStorage.getItem("username");
  if (ifusernamepresent == null) {
    return false;
  }
  return true;
}

logout() {
  let currentUser:Auth = JSON.parse(localStorage.getItem('currentUser'));
  localStorage.removeItem('currentUser');
  console.warn("coming to logout");
  console.warn(currentUser);
  this.http.delete(this.port+'/user/logout',{params: new HttpParams().set('user',currentUser.username).set('token',currentUser.token)});
  //sessionStorage.setItem("username",ps.username);
  //sessionStorage.setItem("role",ps.role.roleName);
  this.router.navigate(['']);
}


    
}
