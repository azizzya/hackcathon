import { ISVGComponentProps } from '../../interfaces/SVGComponent.interfaces';

export const MessageSVGComponent: React.FC<ISVGComponentProps> = ({
	fillColor,
	height,
	width,
}) => {
	return (
		<svg
			fill={fillColor}
			width={width}
			height={height}
			viewBox='0 0 31 30'
			xmlns='http://www.w3.org/2000/svg'
		>
			<path d='M9.06415 24.8425C9.43913 24.4112 10.0578 24.2613 10.6016 24.4675C12.1202 25.03 13.7889 25.3112 15.4763 25.3112C22.5447 25.3112 28.1319 20.249 28.1319 14.0618C28.1319 7.87459 22.5447 2.81236 15.4763 2.81236C8.40793 2.81236 2.82072 7.87459 2.82072 14.0618C2.82072 16.3304 3.57068 18.5053 4.95811 20.3427C5.1456 20.6052 5.2581 20.9239 5.23935 21.2614C5.16435 22.6863 4.48939 24.5987 3.21445 27.1299C5.98931 26.9236 7.90171 26.1362 9.06415 24.8425ZM2.33325 29.9985C1.93683 30.0132 1.54357 29.9228 1.19333 29.7365C0.843102 29.5502 0.548351 29.2746 0.33896 28.9377C0.129569 28.6008 0.0129839 28.2145 0.00102312 27.818C-0.0109377 27.4214 0.0821514 27.0288 0.270853 26.6799C1.20234 25.0781 1.90893 23.3558 2.37074 21.5614C0.835346 19.3617 0.0108761 16.7443 0.00836641 14.0618C0.00836641 6.24343 6.90801 0 15.4763 0C24.0446 0 30.9443 6.24343 30.9443 14.0618C30.9443 21.8801 24.0446 28.1236 15.4763 28.1236C13.7514 28.1236 12.0827 27.8798 10.4891 27.3736C8.61417 29.0423 5.87681 29.886 2.33325 29.9985Z' />
		</svg>
	);
};
