import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { Router } from '@angular/router';
import { Subject } from '../Pojos/Subject';
import { Test } from '../Pojos/Test';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {

  private port:String = "http://localhost:8080";
  constructor(private http:HttpClient,private router:Router) { }


  getAllSubjects(): Observable<Subject[]> {
    return this.http.get<Subject[]>(this.port+'/subject/getall');
  }
}
