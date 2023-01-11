import { TestBed } from '@angular/core/testing';

import { JavaAiService } from './java-ai.service';

describe('JavaAiService', () => {
  let service: JavaAiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(JavaAiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
