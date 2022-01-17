import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { ModelComponent } from './model/model.component';
import { ServicesComponent } from './services/services.component';
import { RoomComponent } from './services/room/room.component';
import { HttpClientModule } from '@angular/common/http';
import { ReservationComponent } from './services/reservation/reservation.component';
import { LoginComponent } from './login/login.component';
import { GallaryComponent } from './home/gallary/gallary.component';
import { ReactiveFormsModule } from '@angular/forms';
import { PaymentComponent } from './payment/payment.component';
import { PaySuccessComponent } from './payment/pay-success/pay-success.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { GuestComponent } from './sign-up/guest/guest.component';
import { ContactusComponent } from './contactus/contactus.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ModelComponent,
    ServicesComponent,
    RoomComponent,
    ReservationComponent,
    LoginComponent,
    GallaryComponent,
    PaymentComponent,
    PaySuccessComponent,
    SignUpComponent,
    GuestComponent,
    ContactusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
