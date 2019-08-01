import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { PanelComponent } from './panel/panel.component';
import { StudentpanComponent } from './studentpan/studentpan.component';
import { ModeratorpanComponent } from './moderatorpan/moderatorpan.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AppComponent } from './app.component';
import { QuizComponent } from './quiz/quiz.component';


const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'panel', component:PanelComponent},
  {path:'studentpan', component:StudentpanComponent},
  {path:'moderatorpan', component:ModeratorpanComponent},
  {path:'login', component:AppComponent},
  {path:'quiz', component:QuizComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
