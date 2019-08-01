import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';
import { Test } from '../Pojos/Test';

@Injectable({
  providedIn: 'root'
})
export class TestService {
  private port:String = "http://localhost:8080";

  constructor(private http:HttpClient,private router:Router) { }

  getAllTestsForSubject(subid:number): Observable<Test[]> {
    return this.http.get<Test[]>(this.port+'/test/gets/'+subid);
  }
}
