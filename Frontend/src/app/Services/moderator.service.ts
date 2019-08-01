import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import { prepareProfile } from 'selenium-webdriver/firefox';
import { Router } from '@angular/router';
import { User } from '../Pojos/User';

@Injectable({
  providedIn: 'root'
})
export class ModeratorService {
  private port:String = "http://localhost:8080";

  constructor(private http:HttpClient,private router:Router) { }

  
  addModerator(user1:string,pass:string,role:string){
    return this.http.post(this.port+'/user/register',null,{params: new HttpParams().set('username',user1).set('pass',pass).set('role',role)});
  }

  getAllModerator(role:string): Observable<User[]> {
    return this.http.get<User[]>(this.port+'/user/findrole/'+role);
  }

  deleteModerator(roleid:string) {
    console.log("aala re govinda aala"+roleid);
    return this.http.delete(this.port+'/user/delete/'+roleid);
  }

}
