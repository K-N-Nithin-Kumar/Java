import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowallComponent } from './showall/showall.component';

import { ShowexpiredComponent } from './showexpired/showexpired.component';

const routes: Routes = [ {
  path:'all', component: ShowallComponent
},{
  path:'exp', component: ShowexpiredComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
