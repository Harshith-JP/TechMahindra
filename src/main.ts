import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { provideRouter, Routes } from '@angular/router';
import { AuthComponent } from '../src/app/components/auth/auth.component';
import { QuizComponent } from '../src/app/components/quiz/quiz.component';
import { DashboardComponent } from '../src/app/components/dashboard/dashboard.component';
import { WorkoutsComponent } from '../src/app/components/workouts/workouts.component';

const routes: Routes = [
  { path: '', component: AuthComponent },
  { path: 'quiz', component: QuizComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'workouts', component: WorkoutsComponent },
];

bootstrapApplication(AppComponent, {
  providers: [provideRouter(routes)],
}).catch((err) => console.error(err));