import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AiStatusImageComponent } from './ai-status-image/ai-status-image.component';
import { HomeComponent } from '../pages/home/home.component';
import { AiButtonCallComponent } from './ai-button-call/ai-button-call.component';
import { DescriptionComponent } from './layout/description/description.component';
import { FooterComponent } from './layout/footer/footer.component';



@NgModule({
  declarations: [
    AiStatusImageComponent,
    AiButtonCallComponent,
    DescriptionComponent,
    FooterComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AiStatusImageComponent,
    AiButtonCallComponent,
    DescriptionComponent,
    FooterComponent
  ]
})
export class ComponentsModule { }
