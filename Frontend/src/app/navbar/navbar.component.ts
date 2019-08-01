import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {LoginService} from '../Services/LoginServices'
import * as $AB from 'jquery';
import * as bootstrap from "bootstrap";
import { HttpErrorResponse } from '@angular/common/http';
import { User } from '../Pojos/User';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  profileForm: FormGroup;
  username: FormControl;
  password: FormControl;
  registerForm: FormGroup;
  rusername: FormControl;
  rpassword: FormControl;
  cpassword: FormControl;
  display: '';
  userloggedIn: boolean =  false;
  adminname:string = "admin";
 modname:string = "moderator";
 uname:string = "";

  uuuu = "";

  constructor(private lservice:LoginService,private router : Router) { }

  ngOnInit() : void{
    this.profileForm = new FormGroup({
      username: new FormControl('', [
        Validators.required,
      Validators.minLength(8),
    Validators.maxLength(20)]),
      password: new FormControl('', [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(20)
      ]),
    });
    this.registerForm = new FormGroup({
      rusername: new FormControl('',[
        Validators.required,
          Validators.minLength(8),
            Validators.maxLength(20)
      ]),
      rpassword: new FormControl('', [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(20)
      ]),
      cpassword: new FormControl('', [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(20)
      ]),
    });
    }

    onSubmit() {
      // TODO: Use EventEmitter with form value
      console.warn(this.profileForm.value.username);
      this.lservice.checkUser1(this.profileForm.value.username,this.profileForm.value.password).pipe()
        .subscribe((ps) => {
          if (ps == null){
            alert("melya tujhe hyacha");
          }
          localStorage.setItem('currentUser', JSON.stringify(ps));
          this.uuuu = ps.username;
          if (ps.rolename == "admin"){
            this.router.navigate(['/','panel']);
          }
          else if(ps.rolename == "moderator"){
            this.router.navigate(['/','moderatorpan']);
          }
          else if(ps.rolename == "student"){
            this.router.navigate(['/','studentpan']);
          }
          $("#signinModalCenter").modal('hide');
          $("#signinModalCenter")
          this.userloggedIn = true;
        },
        err=> {
          if (err instanceof HttpErrorResponse) {
            if (err.status == 500){
              alert("Incorrect/Blank Username or Password");
            }
          }
        }
        )
    
    }
    onRegister() {
      // TODO: Use EventEmitter with form value
      console.warn(this.registerForm.value);
      if (this.registerForm.value.cpassword != this.registerForm.value.rpassword){
        alert("Passwords do not match");
      }
      this.lservice.addUser(this.registerForm.value.rusername,this.registerForm.value.rpassword,"student").subscribe();
      $("#registerModalCenter").modal('hide');
    }

  onLogout(){
      this.lservice.logout();
      this.userloggedIn = false;
    }

}
