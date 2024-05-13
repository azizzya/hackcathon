import { taskService } from '@/shared/api/task.service';
import { useMutation, useQueryClient } from '@tanstack/react-query';

export function useDeleteTaskMutation() {
	const queryClient = useQueryClient();
	return useMutation({
		mutationFn: (id: number) => taskService.delete(id),
		mutationKey: ['task', 'delete'],
		onSuccess: () => {
			queryClient.invalidateQueries({ queryKey: ['tasks'] });
		},
	});
}
