import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AiStatusImageComponent } from './ai-status-image/ai-status-image.component';
import { HomeComponent } from '../pages/home/home.component';



@NgModule({
  declarations: [
    AiStatusImageComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AiStatusImageComponent
  ]
})
export class ComponentsModule { }
