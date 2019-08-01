import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { PanelComponent } from './panel/panel.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule} from '@angular/forms';
import { LoginService } from './Services/LoginServices';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ModeratorpanComponent } from './moderatorpan/moderatorpan.component';
import { StudentpanComponent } from './studentpan/studentpan.component';
import { JwtInterceptor } from './_helpers/jwt.interceptor';
import { QuizComponent } from './quiz/quiz.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    PanelComponent,
    ModeratorpanComponent,
    StudentpanComponent,
    QuizComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass:JwtInterceptor, multi: true },
  
  
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
