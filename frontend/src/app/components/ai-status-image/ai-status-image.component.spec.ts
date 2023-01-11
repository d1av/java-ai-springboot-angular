import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AiStatusImageComponent } from './ai-status-image.component';

describe('AiStatusImageComponent', () => {
  let component: AiStatusImageComponent;
  let fixture: ComponentFixture<AiStatusImageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AiStatusImageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AiStatusImageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
