import { Component } from '@angular/core'; 
import { FormBuilder, FormGroup, Validators } from '@angular/forms'; 
import { AuthService } from '../../services/auth.service'; 
import { Router } from '@angular/router'; import { ReactiveFormsModule } from '@angular/forms'; 
// Import ReactiveFormsModule 
@Component({ selector: 'app-auth', 
  template: ` <h2>{{ isLogin ? 'Login' : 'Register' }}</h2> 
  <form [formGroup]="authForm" (ngSubmit)="onSubmit()"> 
    <input type="text" placeholder="Username" formControlName="username" />
     <input type="password" placeholder="Password" formControlName="password" *ngIf="!isLogin" /> 
     <button type="submit">{{ isLogin ? 'Login' : 'Register' }}

     </button> <p (click)="toggleForm()">{{ isLogin ? 'Register' : 'Login' }}</p> 
     </form> `, imports: [ ReactiveFormsModule // Include ReactiveFormsModule in the imports array 
     ], standalone: true // Ensure the component is standalone 
     }) 
     export class AuthComponent 
     { 
      authForm: FormGroup; 
      isLogin = true; 
      constructor( 
        private fb: FormBuilder,
         private authService: AuthService, 
         private router: Router ) 
         { this.authForm = this.fb.group({ username: ['', Validators.required], password: [''], });
         } 
         onSubmit(): void 
         { if (this.authForm.valid) 
          { if (this.isLogin) { this.authService .login(this.authForm.value) .subscribe(() => this.router.navigate(['/quiz'])); } else { this.authService .register(this.authForm.value) .subscribe(() => this.router.navigate(['/quiz'])); } } } toggleForm(): void { this.isLogin = !this.isLogin; if (this.isLogin) { this.authForm.get('password')?.clearValidators(); } else { this.authForm.get('password')?.setValidators([Validators.required]); } this.authForm.get('password')?.updateValueAndValidity(); } } 