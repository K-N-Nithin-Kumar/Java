import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { DemoNgZorroAntdModule } from 'src/DemoNgZorroAntdModule';
import { NavbarComponent } from './navbar/navbar.component';
import { NZ_I18N, en_US } from 'ng-zorro-antd/i18n';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDialogModule} from '@angular/material/dialog';
import { NzModalService } from 'ng-zorro-antd/modal';

import { MatTableModule } from '@angular/material/table'  
import { MatInputModule } from '@angular/material/input';


import { MatOptionModule } from '@angular/material/core';

import {MatSlideToggleModule} from '@angular/material/slide-toggle';

import {MatSelectModule} from '@angular/material/select';
import { registerLocaleData } from '@angular/common';
import en from '@angular/common/locales/en';
import { ShowallComponent } from './showall/showall.component';

import { ShowexpiredComponent } from './showexpired/showexpired.component';

registerLocaleData(en);


@NgModule({
  declarations: [
    AppComponent,
  NavbarComponent,
  ShowallComponent,
 
  ShowexpiredComponent
 
  
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    DemoNgZorroAntdModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    MatCardModule,
    MatToolbarModule,
    FormsModule, 
    MatButtonModule,
    MatIconModule, 
    MatFormFieldModule,
    MatDialogModule,
    MatTableModule,
    MatInputModule,
    MatOptionModule,
    MatSlideToggleModule,
    MatSelectModule
  ],
  providers: [ { provide: NZ_I18N, useValue: en_US }],
  bootstrap: [AppComponent]
})
export class AppModule { }
