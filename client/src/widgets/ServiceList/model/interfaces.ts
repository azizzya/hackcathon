import { ISVGComponentProps } from '@/shared/interfaces/SVGComponent.interfaces';

export interface IServiceCardProps {
	id: number;
	text: string;
	label: string;
	SVGComponent: React.FC<ISVGComponentProps>;
}
