import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthComponent } from './components/auth/auth.component';
import { QuizComponent } from './components/quiz/quiz.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { WorkoutsComponent } from './components/workouts/workouts.component';

const routes: Routes = [
  { path: '', component: AuthComponent }, // Login/Register
  { path: 'quiz', component: QuizComponent }, // Quiz
  { path: 'dashboard', component: DashboardComponent }, // Dashboard
  { path: 'workouts', component: WorkoutsComponent}, // Workouts
  { path: '', redirectTo: '' }, // Redirect to login/register if route not found
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}